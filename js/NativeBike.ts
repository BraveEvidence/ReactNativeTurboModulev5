import {TurboModule, TurboModuleRegistry} from 'react-native';

interface Spec extends TurboModule {
  calculateAverage(average: number): Promise<number>;

  getBikeName(bikeName: string): string;
}

export default TurboModuleRegistry.getEnforcing<Spec>('Bike');
